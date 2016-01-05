(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:output-to "release/hello_npm.js"
     :output-dir "release"
     :optimizations :simple
     :target :nodejs
     :verbose true
     :main 'hello-npm.core})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
