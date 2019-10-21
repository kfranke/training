package com.bozemantofushop

//DatabaseConnection dbc = new DatabaseConnection() //fail. singleton puts the smackdown. with singleton only one instance can exist
//println dbc

DatabaseConnection dbc2 = DatabaseConnection.instance //works
println dbc2

