# hello-cljs-compiler

This is the second example program from ClojureScript Up and Running by Stuart Sierra and Luke Vanderhart.
It is set up as a leiningen and Counterclockwise project (see @cemerick's video: http://www.youtube.com/watch?v=VVd4ow-ZcX0)


## Usage

Build: from a shell prompt anywhere within the project:

% lein repl

user=> (require 'cljs.closure)

user=> (cljs.closure/build "src/cljs"
       {:output-to "resources/public/hello.js"
       :optimizations :advanced})
       
View: open resources/public/hello.html in a browser.

## License

Distributed under the Eclipse Public License, the same as Clojure.
