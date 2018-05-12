{:dev
 {:aliases {"clj-tests" ["with-profile" "dev,1.9:dev,1.8:dev,1.7:dev,1.6:dev" "test"]
            "cljs-tests" ["with-profile" "cljs" "doo" "node" "once"]
            "cljs-auto" ["with-profile" "cljs" "cljsbuild" "auto"]
            "cljs-once" ["with-profile" "cljs" "cljsbuild" "once"]}}
 :cljs {:plugins    [[lein-cljsbuild "1.1.5"]
                     [lein-doo "0.1.7"]]
        :doo        {:build "test"}
        :cljsbuild
        {:builds
         {:test
          {:source-paths ["src" "test"]
           :compiler     {:main          bouncer.runner
                          :output-to     "target/test/core.js"
                          :target        :nodejs
                          :optimizations :none
                          :source-map    true
                          :pretty-print  true}}}}
        :prep-tasks [["cljsbuild" "once"]]
        :hooks      [leiningen.cljsbuild]}
 :1.6  {:jdependencies [[org.clojure/clojure "1.6.0"]]}
 :1.7  {:jdependencies [[org.clojure/clojure "1.7.0"]]}
 :1.8  {:jdependencies [[org.clojure/clojure "1.8.0"]]}
 :1.9  {:jdependencies [[org.clojure/clojure "1.9.0"]]}}
