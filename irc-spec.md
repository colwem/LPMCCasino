#IRC Specifications - LPMC Casino
##Overview
This is a specifications document for the commands used via an IRC channel
to interact with the LPMC Casino. These specifications should be adhered to
in order to interact with the casino API properly, and allow for a consistent
user interaction across all platforms. 

Technical note: In order to prevent confusion within the IRC, it is suggested
that each nickname is bound to a sessid after logging in.

##Commands List
###Private
These commands must be issued privately, either via a notice or private message

    !login <username> <password>
    !createacc <username> <password> <password> <email> <email>
    !change <item> <new value>
    !recover <email>
    
###Public
These commands can either be issued privately via a notice or private message,
or publically, via a channel.

    !logout
    
NOTE: This command list is incomplete as it does not currently include game
commands, they will be added as progress is made.