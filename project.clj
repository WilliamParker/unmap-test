(defproject unmap_test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0-RC4"]]
  :profiles {:dbg-profile {:jvm-opts ["-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5010"]}}
  :aliases {"debug" ["with-profile" "dbg-profile" "repl"] }
  :aot :all)
