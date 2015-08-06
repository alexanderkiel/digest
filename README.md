# Digest

[![Build Status](https://travis-ci.org/alexanderkiel/digest.svg?branch=master)](https://travis-ci.org/alexanderkiel/digest)

The goal of this library is to provide a simple and clean message digest
implementation for Clojure and possible ClojureScript without any dependencies
and without any magic code.

## Other Libs

### Pandect

[Pandect][1] is likely the most comprehensive message digest library for Clojure
but it depends on [Potemkin][2] and [Bouncy Castle Crypto APIs][3]. Additionally
it uses code generation and too much macros for my taste.

### clj-digest

[clj-digest][5] is pretty close but it uses things like `(.getBytes s)` without
a charset and is three times slower than pandect according pandect benches.

### clj-message-digest

[clj-message-digest][4] is simply too old with the last commit at the end of
2011.

## License

Copyright © 2015 Alexander Kiel

Distributed under the Eclipse Public License, the same as Clojure.

[1]: <https://github.com/xsc/pandect>
[2]: <https://github.com/ztellman/potemkin>
[3]: <https://www.bouncycastle.org/java.html>
[4]: <https://github.com/ray1729/clj-message-digest>
[5]: <https://github.com/tebeka/clj-digest>
