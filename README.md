Test Vagrant 
--
This project gives the basic example of using Rest Assured library to test your API endpoints.

**Example**

Hitting the endpoint at URL: 
https://gist.github.com/kumarpani/1e759f27ae302be92ad51ec09955e765/raw/184cef7125e6ef5a774e60de31479bb9b2884cb5/TeamRCB.json
and you would get back the following JSON response

{
"name": "Royal Challengers Bangalore",
"location": "Bangalore",
"player": [{
"name": "Faf Du Plessis",
"country": "South Africa",
"role": "Batsman",
"price-in-crores": "7"
},
{
"name": "Virat Kohli",
"country": "India",
"role": "Batsman",
"price-in-crores": "15"
},
{
"name": "Glenn Maxwell",
"country": "Australia",
"role": "Batsman",
"price-in-crores": "11"
},
{
"name": "Mohammad Siraj",
"country": "India",
"role": "Bowler",
"price-in-crores": "7"
},
{
"name": "Harshal Patel",
"country": "India",
"role": "Bowler",
"price-in-crores": "10.75"
},
{
"name": "Wanindu Hasaranga",
"country": "Srilanka",
"role": "Bowler",
"price-in-crores": "10.75"
},
{
"name": "Dinesh Karthik",
"country": "India",
"role": "Wicket-keeper",
"price-in-crores": "5.5"
},
{
"name": "Shahbaz Ahmed",
"country": "India",
"role": "All-Rounder",
"price-in-crores": "2.4"
},
{
"name": "Rajat Patidar",
"country": "India",
"role": "Batsman",
"price-in-crores": "0.20"
},
{
"name": "Josh Hazlewood",
"country": "Australia",
"role": "Bowler",
"price-in-crores": "7.75"
},
{
"name": "Mahipal Lomror",
"country": "India",
"role": "Bowler",
"price-in-crores": "7.75"
}
]
}

Using the Rest Assured library we write the test code as:

See **TeamRCBTest.java** in the source code.

**Libraries( Maven Dependency Injection and Plugins (pom.xml) )**

- Java 15
- TestNG 
- Rest Assured 
- Jackson Core 
- Jackson databind 
- Maven Surefire Plugin

**Running the Test**
- Using testng.xml file
- Using pom.xml file (execute mvn clean install test command through command line)