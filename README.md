# read-twitter-java

I was tasked recently with looking into the possibility of sending direct messages to Twitter users. These "users" would in fact be 
companies that feature in the various themed equity indexes we maintain and calculate. For example, let's say Rio Tinto was one of the 
top 10 performers for the previous month in one of the indexes that we maintain and compute, we would be wanting to send a message to 
their twitter page advising them of this fact. Basically it was a way of promoting our family of indexes in particular and our company 
in general. 

That's the background, so if you're interested in how this was done - all in less than 50 lines of JAVA code - please read on.

Basically, the way you do this is to take advantage of the Application Programming Interface or API that Twitter provides. The API is 
exactly what is says on the tin. It's an interface to a bunch of a ready-made series of functions and/or procedures that you call within 
your programs to fetch or send data to or from Twitter. The easiest way to do all this is to use a third-party developed library and, 
since we will be using JAVA, the most popular of these is called Twitter4J and can be found at twitter4j.org.  Just download it then 
either add the .JAR file to your CLASSPATH or to your reference libraries in your JAVA IDE.

The programming side, as you'll see shortly, is fairly straightforward but before you do anything there is a bit of setting up to 
do first. Twitter uses the OAuth standard for securely accessing its web-site. More details on this can be found 
at https://en.wikipedia.org/wiki/OAuth  but essentially OAuth is a standard method of allowing access to web-sites without requiring a 
formal password to be entered. The other thing you'll need obviously is a Twitter account because to use OAuth you have to tell  twitter 
what you're about to do with its API. In “twitter speak” this is called registering your app and you do this at 
https://apps.twitter.com. 

When your app is registered it will then be assigned a number of security keys ( the OAuth bit ) which you will need to specify in 
your code to allow it do its thing.

First things first, go to web-site https://apps.twitter.com and login with your regular Twitter account credentials, then click on 
the Create New App button. You'll will then need to enter three pieces of information.


The name of your app 	

This can be any  name you like that you haven't used before for a twitter app.

A description for your app

Again enter here anything you like but it has to be longer that a  certain number of characters.
 
A home web page for the app 

If you have your own web-site enter its address here otherwise you can just enter http://127.0.0.1 and you should be fine.

Agree to the Developer Conditions and hit the Create Your Twitter application button. Assuming all is OK, on the next screen 
you need to take a note of the Consumer Key and the Consumer Secret key. After this click on the Create My Access Token button and 
take a note of the Access Token and Access Token Secret keys that are displayed. When you have done this you have all the info you 
need to start creating twitter apps.

In the included JAVA program file my twitter credentials have been starred out for security reasons. Put your own codes in their place.

