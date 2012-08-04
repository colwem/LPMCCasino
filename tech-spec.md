#Technical Specifications - LPMC Casino

##Overview
This is the technical specification of the LPMC Casino. It is designed to provide technical direction for the creation
of the game and administration logic (AKA: backend). These specifications should serve as a guide, if there is a
legitimate reason to deviate from the specification, this is understandable. 

##High Level Interaction
There are five layers to this application:
####Client side
- Presentation Layer
    - The presentation layer is either:
        - The Java GUI Applet built on Swing
        - The IRC outputs of a bot
- Client Communication Layer
    - The client communication layer is either:
        - Java code running within the applet
        - The communication logic of the IRC bot
    Both communication layers follow the syntax defined within the API specification (api-spec.md).

####Server side
- Server Communication Layer
    - This layer provides a language agnostic representation of game and client states, to be consumed by the client
    communication layers.
- Logic Layer
    - The primary logic repository. All game logic and execution will happen in this layer, to be passed back to the
    server communication layer for consumption.
- Database Layer
    - This layer is primarily a wrapper to the SQL database that holds the relevant player information.

And they interact linearly as such:

            Presentation Layer
                    |
                    |
        Client Communication Layer
                    |
                    |
                    |
                    |
        Server Communication Layer            
                    |
                    |
               Logic Layer
                    |
                    |
             Database Layer

##Descriptions of Layers
Each layer will have it's own defined interface, and must be decoupled from every other layer. This requirement
trumps all others. These descriptions will be fleshed out over the next few days.

###Server Side
###Server Communication Layer
This is a wrapper around the API communication protocol. This layer parses out the incoming messages and appropriates
them to the correct game or administrative class within the logic layer. This will be the primary execution layer for
the server side code. As it accepts and parses incoming messages, a different thread of the correct logic layer will be 
created to play that game.

###Logic Layer
This is by far the most complicated layer, as it controls all game logic for all 5 games.

###Database Layer
The database layer is a wrapper for a SQL database that stores the relevant user information. This is the only way
to interact with the database, and will be accessed almost exclusively by the logic layer. It consists of a single
database access class, implemented as a singleton.

    Interaction Diagram and Method Listing
        
        Abstract Logic Layer
                |
                |
        IDatabaseAccess.java
            + openServer() : DatabseObject 
            + openServer(String server) : DatbaseObject
            + getUserInfo(String user) : String[]
            + getEmail(String user) : String
            + getPassword(String user) : String
            + getMoney(String user): String
            + getCurrency(String user) : String
            + setEmail(String user, String email) : boolean
            + setPassword(String user, String password) : boolean
            + setMoney(String user, int money) : boolean
            + setCurrency(String user, int currency) : boolean
                |
                |
        MYSQL Datbase
            Table - user
                Fields:
                pkey
                username
                password
                email
                money
                currency
                    

###Client Side
###Client Communication Layer
This is another wrapper around the API communication protocol. The GUI will create and use one of these as needed 
in order to send and recieve information from the server. 

###Presentation Layer
This layer is the primary interface with the user. There are two presentation layers currently being developed. The
first layer is a Swing GUI in Java, that follows the layout of the functional specifications detailed in the
func-spec.md document. The second layer is a plugin for an IRC bot, that uses a consistent set of commands in order
to provide the same functionality in a text-based format. 