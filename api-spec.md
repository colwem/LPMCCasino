#API Specification - LPMC Casino
##Basic Descrption
This API is a language agnostic syntax used to communicate between the client and server layers, allowing independence
of implementation between client and server. 

##General Guidelines
- This is a raw socket connection, which uses a stream of string information to communicate between client and server.
- Overall syntax considerations:
    - A distinct information block (eg: A login request or a bet from one of the games) will be bound by two pipes (||).
    - Immediately following the pipes will be the name of the block of information
    - The data of a information block will be delimited from the name by two colons (::)
    - Varying pieces of data within that command block will delimited by a pipe (|)
    - Each piece of data will be set off by a standardized identifier, and identified by a standardized naming 
    scheme followed by a colon (:)
    - The data will continue in this fashion until the next double pipe (||) is met, marking the end of that
    information block
    - All of these identifying marks, should they need to be included in a datastream, will be escaped using a 
    blackslash (\\).
    - These blocks are case insentitive, but good practices calls for all lower case

Example:

    ||userinfo::user:locke|email:locke@uga.edu|currency:dollar|money:500||

##Full Specification
###General Syntax Template
    ||<NameOfInfo>::<Component1>:<Info>|<Component2>:<Info>|...|<ComponentN>:<Info>||


    
###Administrative Blocks
####Component Descriptions
    - user: A user's full username
    - pass: A user's full password
    - email: A user's full email
    - currency: A user's currency
    - money: A user's money (READ-ONLY)
    - userinfo: A complete list of the above (READ-ONLY)
    - new: When modifying a component, this is the new version
    - old: When modifying a component, this is the old version
    - target: When a command can be specified to multiple locations, this specifies the name of the location. 
    This target will *always* be another component name, however that component must not be read only.
    

####Getters
Email - 

Currency -

Money - 

User Information - 


####Setters
Change - Modifies a user's account information
    Name: change
    Components: user, target, old, new
    Syntax: ||change::target:<target>|old:<oldvalue>|new:<newvalue>||

####Functions
Login - Validates a user logging in.
    Name: login
    Components: user, pass
    Syntax: ||login::user:<username>|pass:<password>||
Logout - Ends a users session.
    Name: logout
    Compnents: user
    Syntax: ||logout::user:<username>||
Recover Account Information - Sends a user their username and reset their password
    Name: recover
    Components: email
    Syntax: ||recover::email:\<email\>||