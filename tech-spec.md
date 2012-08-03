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
    Both communication layers follow the syntax defined within the API specification of this document.

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
         
