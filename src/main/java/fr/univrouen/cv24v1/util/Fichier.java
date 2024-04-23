package fr.univrouen.cv24v1.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.util.FileCopyUtils;

public class Fichier {
	
	public String loadFileXML() {
		org.springframework.core.io.Resource resource;
		resource = new DefaultResourceLoader().getResource("smallCV.xml");
        try (Reader reader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8)) {
            return FileCopyUtils.copyToString(reader);
        } catch (IOException e) {
            e.printStackTrace();
            return "Erreur lors du chargement du fichier : " + e.getMessage();
        }
	}

}
