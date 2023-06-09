/*
 * You can use the following import statements
 *
 * import org.springframework.jdbc.core.RowMapper;
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 *
 */

// Write your code here

package com.example.movie.model; 
import  java.util.*;  
import org.springframework.jdbc.core.RowMapper;  
import com.example.movie.model.Movie;

import java.sql.SQLException;

import java.sql.ResultSet; 


public class MovieRowMapper implements RowMapper<Movie>{

     
    public Movie  mapRow(ResultSet rs,int rowNum) throws SQLException{
        return new Movie (
            rs.getInt("movieId"), 
            rs.getString("movieName"), 
            rs.getString("leadActor")
        );
    }
}
