# ![Milkman Logo](img/milk-bottle.png) Milkman - An Extensible Request/Response Workbench

Milkman is heavily inspired by Postman. But I got sick of all those electron-based applications that need ages and loads of memory to start up.
Therefore i created a JavaFx-based workbench for crafting requests / responses. It is not limited to e.g. http (or more specificaly rest) requests. Due to nearly 
everything being a plugin, other things are possible, like database-requests or GRPC, GraphQl, etc...

# Features

 * **Everything is a plugin: ** Request-types (e.g. Http Request), request-aspects (e.g. Headers, Body, etc), editors for request aspects (e.g. table-based editors for headers), importers, whatever it is, you can extend it. The core application only handles Workspaces with Environments, Collections, Requests and their aspects.
 * **Http Request Plugin: ** Several plugins are provided already that extend the core application to be a replacement for postman. Crafting and Executing Http/Rest requests with json highlighting. Proxy-server support.
 * **JavaFX Application: ** as in: `fast` (compared to electron at least :D)
 
# Download

Download latest version in [Release Section](https://github.com/warmuuh/milkman/releases).

# Showcase

![Milkman Logo](img/screenshot.png)

# Plugins

No client fits all, so you are **encouraged** to write your own plugins to e.g. add headers that are necessary for your internal service structures or add importers for internal service registries.

A sample plugin was provided (TBD) that extends all requests with a `Note` tab so you can add some description to any kind of requests. 

# Roadmap
This is only the beginning. Following features are already planned:

 * javascript runner for pre/post request actions / testing of responses
 * themes (code / milkman)
 * explore json responses using [JMesPath](http://jmespath.org/)
 * SQL plugin to craft SQL Requests against JDBC databases
 * Team synchronization plugins: synchonization via Git-repositories is planned, maybe others, obviously will be plugin-able