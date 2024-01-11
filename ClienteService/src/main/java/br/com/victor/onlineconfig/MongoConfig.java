/**
 * 
 */
package br.com.victor.onlineconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author victor.vianna
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.victor.vendasonline.repository")
public class MongoConfig {

}
