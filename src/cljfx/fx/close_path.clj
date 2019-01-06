(ns cljfx.fx.close-path
  (:require [cljfx.lifecycle.composite :as lifecycle.composite]
            [cljfx.fx.path-element :as fx.path-element])
  (:import [javafx.scene.shape ClosePath]))

(def lifecycle
  (lifecycle.composite/describe ClosePath
    :ctor []
    :extends [fx.path-element/lifecycle]))