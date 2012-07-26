#Specifications - Learn Programming Mentoring Community Channel

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
   - Forgot Username Pag: This page allows you to recover your username and password.
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

Usage Case:
Felicity wants to play blackjack, because she as a crippling gambling addiction and can never get enough. Unfortunately for her,
she lives in Georgia where there aren't any casinos. She stumbles upon our website, and immediately goes to start playing. She 
realizes that first she needs to create an account, so she presses the "Create New Account" button, and gets sent to that page,
and from there she goes on to lose all her fake money trying to split 6s, because she has no idea what she's doing.

The next day, Felicity comes back for more. She realizes in a fit of brilliance she already has an account, and types in her username.
She didn't remember her password, however, and sits there for a bit stumped and presses the "Quit" button, which closes the page. 
After going and getting some coffee and reloading the page, she notices the "Forgot your username or password?" button, and clicks it. 
After heading to that page and using her email to recover her password, she returns to the login page and types it in.
She presses login, and is taken into the land of gambling goodness.

TODO:
- A text box labelled "Username" used to input your username
- A text box labelled "Password" used to input your password (Blocked out by *s)
- A status output that tells the user if they were unsuccessful
- A button marked "Login" that allows you to login. This button can be pressed by hitting enter as well.
- A button marked "Create New Account" that takes you to the create new account screen.
- A button marked "Forgot your username or password?"
- A title\header that reads "Learn Programming Casino" in some sans serif font
- A button marked "Quit" used to close the applet
- A fun gambling\casino based graphic to have behind the login interface

DONE:
- Nothing

###Create New Account Page
TODO: Add specs

###Main Page
TODO: Add specs

###Settings Page
TODO: Add specs

###Slots Page
TODO: Add specs

###Blackjack Page
TODO: Add specs

###Roulette Page
TODO: Add specs

###Craps Page
TODO: Add specs

###Texas Hold 'em Page
TODO: Add specs

###Gentleman's Poker Page
TODO: Add specs