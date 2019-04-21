package com.project.BackendRepairs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableConfigurationProperties
@Configuration
@EntityScan(basePackages = {"com.project.model"})  // scan JPA entities
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class BackendRepairsApplication {

//	public static final String SCRIPT_FILE = "exportScript.sql";

	public static void main(String[] args) {
		// Using MySQL Database.

//		String configFileName = "../hibernate-mysql.cfg.xml";
//
//		// Create the ServiceRegistry from hibernate-xxx.cfg.xml
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
//				.configure(configFileName).build();

//		// Create a metadata sources using the specified service registry.
//		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
//
//		SchemaExport export = getSchemaExport();
//
//		System.out.println("Drop Database...");
//		// Drop Database
//		dropDataBase(export, metadata);
//
//		System.out.println("Create Database...");
//		// Create tables
//		createDataBase(export, metadata);
		SpringApplication.run(BackendRepairsApplication.class, args);

	}

//	private static SchemaExport getSchemaExport() {
//
//		SchemaExport export = new SchemaExport();
//		// Script file.
//		File outputFile = new File(SCRIPT_FILE);
//		String outputFilePath = outputFile.getAbsolutePath();
//
//		System.out.println("Export file: " + outputFilePath);
//
//		export.setDelimiter(";");
//		export.setOutputFile(outputFilePath);
//
//		// No Stop if Error
//		export.setHaltOnError(false);
//		//
//		return export;
//	}
//
//	public static void dropDataBase(SchemaExport export, Metadata metadata) {
//		// TargetType.DATABASE - Execute on Databse
//		// TargetType.SCRIPT - Write Script file.
//		// TargetType.STDOUT - Write log to Console.
//		EnumSet<TargetType> targetTypes = EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT, TargetType.STDOUT);
//
//		export.drop(targetTypes, metadata);
//	}
//
//	public static void createDataBase(SchemaExport export, Metadata metadata) {
//		// TargetType.DATABASE - Execute on Databse
//		// TargetType.SCRIPT - Write Script file.
//		// TargetType.STDOUT - Write log to Console.
//
//		EnumSet<TargetType> targetTypes = EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT, TargetType.STDOUT);
//
//		SchemaExport.Action action = SchemaExport.Action.CREATE;
//		//
//		export.execute(targetTypes, action, metadata);
//
//		System.out.println("Export OK");
//
//	}
}
