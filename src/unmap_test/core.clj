(ns unmap-test.core)

(def a :test-1)

(ns-unmap 'unmap-test.core 'a)

(def a :test-2)
