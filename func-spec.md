#Specifications - LPMC Casino

##Overview
This is a functional specification, designed to give direction as to how the user will interact with the applet. 
It is not intended to be a piece of technical documentation, nor is it a complete list of needed features or ideas.
It is merely a starting point in order to have a framework with which to work from. Technical decisions such as how data
is moved around the program are left to the discretion of the programmer.

##Flow of User Interaction
            Login page---------------|---------------|
            |       |                |               |
            |       |                |               |
            |    Create new      Forgot user         |
            |    account page    or pass page -------|
            |       |
            |       |
      |---- Main Page ------------------------------------------------------|
      |     |       |                                                       |
      |   ---       ---                                                     |
      |   |           |                                                     |
      | Settings      Games List                                            |
      |   Page      (On Main Page)                                          |
      |   |           |- Slots -------- Slots Page -------------------------|
      |----           |- Blackjack -------- Blackjack Page -----------------|
                      |- Roulette -------- Roulette Page -------------------|
                      |- Craps -------- Craps Page -------------------------|
                      |- Texas Hold 'em -------- Texas Hold 'em Page -------|
                      |- Gentlemans Poker -------- Gentlemans Poker Page ---|

##General Heirarchy
   - Login Page: This page will be the splash page of the Casino that will load upon first starting the applet.
   - Create New Account Page: This page will allow the user to create a new account in the Casino.
   - Forgot Username Page: This page allows you to recover your username and password.
   - Main Page: This will be the main administrative page that allows you to access the other pages.
   - Settings Page: This page will allow the user to change specific things about their game environment.
     This includes things like currency, types of game rules, etc. This will be expanded as the games are developed.
   - Slots Page: This page will allow the user to play a simple slot machine.
   - Blackjack Page: This page will allow the user to play the game Blackjack, also known as 21, against the dealer.
   - Roulette Page: This page will allow the player to play a game of Roulette.
   - Craps Page: This page will allow the user to play a game of craps.
   - Texas Hold 'em Page: This page will allow the user to play Texas Hold 'em against an AI opponent or set of AI opponents.
   - Gentlemans Poker Page: This page will allow the user to play Gentleman's Poker, also known as 5 card draw, against an AI opponent or set of AI opponents.
    
##Specific Specifications
   This will be where specifications for individual features, pages, or ideas have been described. Any functionality listed here will be marked as either
   "DONE" or "TODO" as an indicator for whether or not it still needs to be completed. Note that the TODO and DONE catagories will not describe the usage 
   of the item, merely defining it's existence. The usage of the page will be defined in it's description.
   
   To request a feature\change be added to the Casino, make your edits to the necessary part of the spec, and submit a pull request. All fuctionality will be defined within this spec.

###Login Page
This is the primary gateway into the application. It's a simple user\name password input form,
that is also able to give back basic feedback.

####Usage Case
Felicity wants to play blackjack, because she as a crippling gambling addiction and can never get enough. Unfortunately for her,
she lives in Georgia where there aren't any casinos. She stumbles upon our website, and immediately goes to start playing. She 
realizes that first she needs to create an account, so she presses the "Create New Account" button, and gets sent to that page,
and from there she goes on to lose all her fake money trying to split 6s, because she has no idea what she's doing.

The next day, Felicity comes back for more. She realizes in a fit of brilliance she already has an account, and types in her username.
She didn't remember her password, however, and sits there for a bit stumped and presses the "Quit" button, which closes the page. 
After going and getting some coffee and reloading the page, she notices the "Forgot your username or password?" button, and clicks it. 
After heading to that page and using her email to recover her password, she returns to the login page and types it in.
She presses login, and is taken into the land of gambling goodness.

####TODO
- A text box labelled "Username" used to input your username
- A text box labelled "Password" used to input your password (Blocked out by *s)
- A status output that tells the user if they were unsuccessful
- A button marked "Login" that allows you to login. This button can be pressed by hitting enter as well.
- A button marked "Create New Account" that takes you to the create new account screen.
- A button marked "Forgot Your Username or Password?"
- A title\header that reads "Learn Programming Casino" in some sans serif font
- A button marked "Quit" used to close the applet
    - This button need a confirmation dialog to make sure the user wants to leave
- A fun gambling\casino based graphic to have behind the login interface

#####Technical Note
All user sensetive information moving from the application to the database will need to be encrypted.

####DONE
- Nothing

###Create New Account Page
The create new account page is used to add a new account to the Casino, and is basic user input
and feedback.

####Usage Case
So Felicity really wants to play blackjack, because she heard that if you're smart you can totally beat the house and make tons
of money doing it. Despite the fact that our game uses no real money, she is highly motivated anyway. Because of this, she needs to create a new account
She goes to enter her username, "xOxHAWTFelicityXoX" and her password, "felicity", as well as her email address. This last one is rather confusing, as 
Filicity doesn't know the difference between an email and an internet. Nevertheless, after a few failed attempts and the response bar telling her she needs
a properly formatted email, she manages to get all the information in. She presses the "Create New Account" button, and logs into the main page of the casino.

####TODO 
- A text box labelled "Username" used to pick a username
    - Usernames can be a combination of letters, numbers, underscores, and periods
- A text box labelled "Password" used to input your password
    - Passwords can have letters numbers and standard symbols
- A text box labelled "Email Address" used to input your email address
- A dropdown of currencies, allowing the user to pick one
- A feedback output used to indicate problems with the above inputs
- A "Create Account" button, used to finish the user input
- A "Back" button used to return you to the login page
    - This button's location should be consistant with the "Quit" button on the login page
- Add the same background used for the login page to this page

####DONE
- Nothing

###Forgot Username or Password Page
This page allows the user to request that their password be reset and sent to them via email. 
Verification is based on them recieving the email, not username or password.

####Usage Case
So Felicity went out to a bar with her friends, and got hammered, because that's lyke, totally her thing. When she finally comes home
after an unsuccessful night of trying to dance while having two left feet, she decides to give in to her favorite vice: Our Casino!

Unfortunately for her, she can't remember her password, thanks to Captain Morgan locking it away deep in his treasure trest of lost memories. 
We're there to the rescue! She clicks on the "Forgot Your Username or Password?" button on the main page, and is taken to the Forgot Username or Password Page.
Here she enters her email, having written it on a little sticky note next to her monitor, and has a new password sent to her. Typing one character at a time, 
staring at the keyboard, she enters it in the main login page, and heads into the Casino.

Even more unfortunately, she won't remember any of this tomorrow, and will be very confused as to why her password doesn't work.
Looks like she'll be back to this page relatively shortly!


####TODO
- A text box that allows the user to input their email
- A verification output to let the user know they have successfully or unsuccessfully sent themselves their
username and new password.
- A back button to return you to the main login page
- Add the same background used for the login page to this page.

####DONE
-Nothing

###Main Page

####Usage Case

####TODO
Add specs

####DONE
-Nothing

###Settings Page

####Usage Case

####TODO
Add specs

####DONE
-Nothing

###Slots Page

####Usage Case

####TODO
Add specs

####DONE
-Nothing

###Blackjack Page

####Usage Case

####TODO
Add specs

####DONE
-Nothing

###Roulette Page

####Usage Case

####TODO
Add specs

####DONE
-Nothing

###Craps Page

####Usage Case

####TODO
Add specs

####DONE
-Nothing

###Texas Hold 'em Page

####Usage Case

####TODO
Add specs

####DONE
-Nothing

###Gentleman's Poker Page

####Usage Case

####TODO
Add specs

####DONE
-Nothing