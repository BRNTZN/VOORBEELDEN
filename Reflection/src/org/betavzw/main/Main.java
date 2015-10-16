package org.betavzw.main;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Klasse die alle klassen in org.betavzw.libs oppikt die geannoteerd zijn met
 * @Beta, vervolgens alle settermethodes oproept die als enig argument een
 * String hebben (en het resultaat toont) en alle String velden invult (en het
 * resultaat toont).
 *
 */
public class Main {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, URISyntaxException {
		String packageNaam = "org.betavzw.libs";

		List<Class<?>> klassen = getKlassenInPackage(packageNaam);

		List<Class<?>> klassenVanBeta = new ArrayList<>();
		for (Class<?> c : klassen) {
			if (c.isAnnotationPresent(Beta.class)) {
				klassenVanBeta.add(c);
			}

		}

		// Met behulp van reflection kunnen we een object van een (onbekende)
		// klasse oproepen.
		for (Class<?> klasse : klassenVanBeta) {
			// maak een object aan van de klasse
			Object o = klasse.newInstance();
			List<Method> stringMethodesMetSetter = getStringMethodesMetSetter(klasse);
			for (Method method : stringMethodesMetSetter) {
				// roep de setter methode op het object op met als argument "Joske"
				method.invoke(o, "Joske");
			}
			System.out.printf(".toString() uitgevoerd na het oproepen van setters in %s: %s\n",
									klasse.getCanonicalName(), o.toString());

		}
		// We kunnen zelfs de waarde van private velden wijzigen.
		for (Class<?> klasse : klassenVanBeta) {
			List<Field> stringVelden = getStringVeldenVanKlasse(klasse);
			Object o = klasse.newInstance();
			for (Field veld : stringVelden) {
				// zorg ervoor dat private velden toegankelijk zijn
				veld.setAccessible(true);
				//vul de waarde in
				veld.set(o, "Lewieke");
			}
			System.out.printf(".toString() uitgevoerd na het invullen van elk Stringveld in %s: %s\n",
									klasse.getCanonicalName(), o.toString());
		}

	}

	/**
	 * Geeft een lijst van klassen terug in een package
	 * 
	 * @param packageNaam
	 *            De naam van het package waarin de klassen staan
	 * @return Een List<Class<?>> met de klassen uit packagenaam
	 * @throws ClassNotFoundException
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	private static List<Class<?>> getKlassenInPackage(String packageNaam)
			throws ClassNotFoundException, IOException, URISyntaxException {
		String directory = packageNaam.replace('.', '\\');
		List<String> klassenamen = getKlasseNamenInDirectory(directory);
		List<Class<?>> klassen = new ArrayList<>();
		for (String klassenaam : klassenamen) {
			String volledigeNaam = packageNaam + "." + klassenaam;
			Class<?> klasse = Class.forName(volledigeNaam);
			klassen.add(klasse);
		}
		return klassen;
	}

	/**
	 * Geeft alle velden van type String terug van een klasse
	 * 
	 * @param klasse
	 *            De klasse waarvan met de velden wil terugkrijgen
	 * @return Een List<Field> met Stringvelden
	 */
	private static List<Field> getStringVeldenVanKlasse(Class<?> klasse) {
		Field[] velden = klasse.getDeclaredFields();
		List<Field> stringVelden = new ArrayList<>();
		for (Field veld : velden) {
			if (veld.getType().equals(String.class)) {
				stringVelden.add(veld);
			}
		}
		return stringVelden;
	}

	/**
	 * Geeft een lijst van alle setter-methodes terug van een klasse met 1
	 * String argument
	 * 
	 * @param klasse
	 *            de klasse waarvan men de setters wil terugkrijgen
	 * @return een List<Method> van setters
	 */
	private static List<Method> getStringMethodesMetSetter(Class<?> klasse) {
		List<Method> methodesMetSetter = new ArrayList<>();
		Method[] methodes = klasse.getDeclaredMethods();
		for (Method methode : methodes) {
			if (methode.getParameterCount() == 1
					&& methode.getParameterTypes()[0].equals(String.class)) {
				if (methode.getName().startsWith("set")) {
					methodesMetSetter.add(methode);
				}
			}
		}
		return methodesMetSetter;
	}

	/**
	 * Geeft een lijst van alle klassenamen terug (bestanden met de extensie
	 * .class) in de directory
	 * 
	 * @param directory
	 *            de directory waarin gezocht moet worden
	 * @return een lijst met klassenamen
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	private static List<String> getKlasseNamenInDirectory(String directory)
			throws IOException, URISyntaxException {
		List<String> bestandsnamen;
		// Maak een onderscheid tussen een .jar-bestand en een gewone directory
		// structuur
		String classpathroot = System.getProperty("java.class.path");

		// classpath van een jar-bestand heeft de extensie .jar
		if (classpathroot.endsWith("jar")) {
			String userdir = System.getProperty("user.dir");
			userdir = userdir.replace('\\', '/');
			// volledig pad van jar bestand
			URI uri = new URI("jar:file:/" + userdir + "/" + classpathroot); 
			Map<String, String> env = new HashMap<>();
			env.put("create", "false");

			// open jar-bestand als bestandssysteem
			try (FileSystem fs = FileSystems.newFileSystem(uri, env)) {
				Path p = fs.getPath(directory);
				bestandsnamen = getClassNamen(p);
			}
		} else {
			Path p = Paths.get(classpathroot, directory);
			bestandsnamen = getClassNamen(p);
		}
		return bestandsnamen;
	}

	/**
	 * Geef alle klassenamen terug in een bepaalde directory("path")
	 * 
	 * @param p
	 *            Het path waarin gezocht moet worden naar bestanden met de
	 *            extensie .class
	 * @return een lijst van bestandsnamen (Strings)
	 * @throws IOException
	 */
	private static List<String> getClassNamen(Path p) throws IOException {
		List<String> bestandsnamen = new ArrayList<>();
		try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(
				p, "*class")) {
			for (Path file : directoryStream) {
				String bestandsnaam = file.getFileName().toString();
				bestandsnamen.add(getBestandsnaamZonderExtensie(bestandsnaam));
			}
		}
		return bestandsnamen;
	}

	/**
	 * Zet een bestandsnaam om naar een naam zonder extensie (we gaan ervan uit
	 * dat de extensie het stuk achter de laatste punt is.
	 * 
	 * @param bestandsnaam
	 *            de naam van het bestand.
	 * @return het stuk voor de laatste punt.
	 */
	private static String getBestandsnaamZonderExtensie(String bestandsnaam) {
		return bestandsnaam.substring(0, bestandsnaam.indexOf("."));
	}

}
