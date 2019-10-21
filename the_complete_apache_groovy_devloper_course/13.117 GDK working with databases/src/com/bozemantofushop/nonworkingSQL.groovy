package com.bozemantofushop

import groovy.sql.Sql

String username = "user"
String password = "password"

def sql = Sql.newInstance("jdbc:mysql://localhost:port/table", username, password, "com.mysql.jdbc.Driver")
println "connected"

sql.execute('DROP TABLE IF EXISTS users')
sql.execute '''
CREATE TABLE users (
id INT NOT NULL,
username VARCHAR(45) NOT NULL,
bio VARCHAR(45) NULL,
PRIMARY KEY (id)
);
'''
String appUser = "billy"
String appBio = "im a little tea pot"
Integer appId = 2

sql.execute '''
INSERT INTO users (id,username,bio) VALUES (1, 'kevin', 'programmer and dirtbag);
'''
// with the triple double quotes we can use the groovy variable/strings
sql.execute """
INSERT INTO users (id,username,bio) VALUES (${appId},${appUser},${appBio});
"""

def rows = sql.rows("select * from users")

sql.eachRow("select * from users"){ row ->
    println row.username
}