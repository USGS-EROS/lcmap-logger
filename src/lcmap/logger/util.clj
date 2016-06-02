(ns lcmap.logger.util
  (:require [clojure.core.memoize :as memo]
            [clojure.string :as string]
            [clojure.tools.logging :as log]))

(defn add-shutdown-handler [func]
  (.addShutdownHook (Runtime/getRuntime)
                    (Thread. func)))

(defn in?
  "This function returns true if the provided seqenuce contains the given
  elment."
  [sequence elm]
  (some #(= elm %) sequence))
