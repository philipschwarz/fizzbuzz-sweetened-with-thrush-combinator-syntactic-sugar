

  (ns fizzbuzz)

  (def divisor-name-map {3 "fizz" 5 "buzz"})
  (def divisors (keys divisor-name-map))
  (def what-is-your-name? divisor-name-map)

  (def concatenate clojure.string/join)

  (def exist? (comp not empty?))

  (def thrush (fn [x] (fn [y] (y x))))
  (def ask thrush)

  (defn fizzbuzzify [number]
    (let [does-it-divide-number? (partial (comp zero? mod) number)
          applicable-divisor-names (for [divisor divisors
                                         :when ((ask divisor) does-it-divide-number?)]
                                     ((ask divisor) what-is-your-name?))]
      (if (exist? applicable-divisor-names)
        (concatenate applicable-divisor-names)
        number)))

  (map fizzbuzzify (range 1 101))







