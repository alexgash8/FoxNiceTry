package ua.gash.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseFacade {
	
	public static List<String> getBooks(){
		
		List<String> result = new ArrayList<String>();
       
		
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgrestest",
                "postgres", "1234")) {
        	
        	System.out.println("Java JDBC PostgreSQL Example postgrestest");
            
            System.out.println("Connected to PostgreSQL postgrestest database!");
            Statement statement = connection.createStatement();            
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books.books");
            while (resultSet.next()) {
                result.add(resultSet.getString("name"));
            }        
        } catch (SQLException e) {
            System.out.println("Connection postgrestest failure.");
            e.printStackTrace();
        }
        return result;    
        }
	}
