package com.example.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.project.entity.Data;
import com.example.project.repository.MongoJpaRepository;

import java.io.BufferedReader;
import java.io.IOException; 
import java.nio.charset.StandardCharsets;
import java.nio.file.Files; 
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//http://localhost:8400/swagger-ui/index.html adresinden swaggera bağlanılabilir.

@SpringBootApplication
public class ProjectApplication implements ApplicationRunner {
	
	@Autowired
	private	MongoJpaRepository mongoJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	
	private static List<Data> readDataFromCSV(String fileName) { 
        List<Data> data = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try 
        (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

            String line = br.readLine();
            line = br.readLine();


            while (line != null) { 

                String[] attributes = line.split(",");
                Data datatest = createData(attributes); 

                data.add(datatest); 

                line = br.readLine(); 
                } } catch (IOException ioe)
        { ioe.printStackTrace(); } return data; 
        }
    private static Data createData(String[] metadata) 
        {

        int mainLevel_id = Integer.parseInt(metadata[0]);
        int xRmean = Integer.parseInt(metadata[1]);
        int xRmin = Integer.parseInt(metadata[2]);
        int xRmax = Integer.parseInt(metadata[3]);
        double sDNN = Double.parseDouble(metadata[4]);
        double rmssd = Double.parseDouble(metadata[5]);
        double nN50 = Double.parseDouble(metadata[6]);
        double pNN50 = Double.parseDouble(metadata[7]);
        double valueIndex = Double.parseDouble(metadata[8]);
        long created_at = Long.parseLong(metadata[9]);
        return new Data(mainLevel_id,xRmean,xRmin,
                xRmax,sDNN,rmssd,nN50,pNN50,valueIndex, created_at);
        }


	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Data> data =readDataFromCSV("src\\main\\resources\\xrtest_1500120_1_1641547130799.csv");
		mongoJpaRepository.saveAll(data);
	}
    
}
