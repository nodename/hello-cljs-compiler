(ns hello-cljs-compiler.hello)

(defn ^:export main []
  (.write js/document "<p>Hello, ClojureScript compiler!</p>"))