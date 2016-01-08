(ns hello-npm.core
  (:require [clojure.browser.repl :as repl]
            [cljs.nodejs :as nodejs]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(nodejs/enable-util-print!)

(defn ^:export add-numbers [a b]
  (+ a b))

(defn -main [& args])

(set! *main-cli-fn* -main)
