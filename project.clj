(defproject matrix-viz "0.1.0"
  :description "A simple library to visualize core.matrix matrices."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure    "1.6.0"]
                 [net.mikera/core.matrix "0.22.0"]
                 [net.mikera/vectorz-clj "0.21.0"]]
  :min-lein-version "2.0.0"
  :global-vars {*warn-on-reflection* true})