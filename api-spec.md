#API Specification - LPMC Casino
##Overview
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
This API is primarily a way for clients to issue commands and receive information from the server. The syntax
of return statements and requests are the same, with different components being sent and received. To be able to 
use the API, the client must first login with a username and a password. From there, the server will issue a sessid, 
which must be included in every call.

###General Syntax Template
    ||<NameOfInfo>::<Component1>:<Info>|<Component2>:<Info>|...|<ComponentN>:<Info>||

###Administrative Blocks
####Component Descriptions
    - sessid: A client's session id
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
    - bool: A boolean value

####Getters
Email - Returns a user's email

    Name: email
    Components: sessid, user
    Returns: email
    Syntax: ||email::sessid:<sessionid>|user:<username>||

Status: NOT STARTED

Currency - Returns a user's currency

    Name: currency
    Components: sessid, user
    Returns: currency
    Syntax: ||currency::sessid:<sessionid>|user:<username>||

Status: NOT STARTED

Money - Returns the amount of money the user has

    Name: money
    Components: sessid, user
    Returns: money
    Syntax: ||money::sessid:<sessionid>|user:<username>||

Status: NOT STARTED

User Information - Returns a block of user information

    Name: userinfo
    Components: sessid, user
    Returns: email, currency, money
    Syntax: ||userinfo::sessid:<sessionid>|user:<username>||

Status: NOT STARTED

####Setters
Change - Modifies a user's account information.

    Name: change
    Components: user, target, old, new
    Returns: bool
    Syntax: ||change::sessid:<sessionid>|target:<target>|old:<oldvalue>|new:<newvalue>||

Status: NOT STARTED

####Functions
Login - Validates a user logging in.

    Name: login
    Components: user, pass
    Returns: sessid
    Syntax: ||login::user:<username>|pass:<password>||

Status: NOT STARTED

Logout - Ends a users session.

    Name: logout
    Compnents: user
    Returns: bool
    Syntax: ||logout::sessid:<sessionid>||

Status: NOT STARTED

Create New Account - Creates a new user account.

    Name: createacc
    Components: user, pass, email, currency
    Returns: sessid
    Syntax: ||createacc::user:<username>|pass:<password>|email:<email>|currency:<currency>||

Status: NOT STARTED

Recover Account Information - Sends a user their username and reset their password

    Name: recover
    Components: email
    Returns: bool
    Syntax: ||recover::email:<email>||

Status: NOT STARTED

###Game Blocks - These will be added as development continues