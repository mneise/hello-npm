(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'hello-npm.core
   :output-to "out/hello_npm.js"
   :output-dir "out"})
