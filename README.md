# typed-async-whatsit

Compiling this project, like so:

```
lein run -m clojure.main -e "(require 'typed-async-whatsit.core)"
```

gets me this:

```
Exception in thread "main" java.lang.ClassCastException: clojure.lang.Symbol cannot be cast to java.util.Map$Entry, compiling:(typed_async_whatsit/core.clj:22:5)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6651)
	at clojure.lang.Compiler.analyze(Compiler.java:6445)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6632)
	at clojure.lang.Compiler.analyze(Compiler.java:6445)
	at clojure.lang.Compiler.analyze(Compiler.java:6406)
	at clojure.lang.Compiler$BodyExpr$Parser.parse(Compiler.java:5782)
	at clojure.lang.Compiler$LetExpr$Parser.parse(Compiler.java:6100)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6644)
	at clojure.lang.Compiler.analyze(Compiler.java:6445)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6632)
	at clojure.lang.Compiler.analyze(Compiler.java:6445)
	at clojure.lang.Compiler.analyze(Compiler.java:6406)
	at clojure.lang.Compiler$BodyExpr$Parser.parse(Compiler.java:5782)
	at clojure.lang.Compiler$FnMethod.parse(Compiler.java:5217)
	at clojure.lang.Compiler$FnExpr.parse(Compiler.java:3846)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6642)
	at clojure.lang.Compiler.analyze(Compiler.java:6445)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6632)
	at clojure.lang.Compiler.analyze(Compiler.java:6445)
	at clojure.lang.Compiler.access$100(Compiler.java:38)
	at clojure.lang.Compiler$DefExpr$Parser.parse(Compiler.java:538)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6644)
	at clojure.lang.Compiler.analyze(Compiler.java:6445)
	at clojure.lang.Compiler.analyze(Compiler.java:6406)
	at clojure.lang.Compiler.eval(Compiler.java:6707)
	at clojure.lang.Compiler.load(Compiler.java:7130)
	at clojure.lang.RT.loadResourceScript(RT.java:370)
	at clojure.lang.RT.loadResourceScript(RT.java:361)
	at clojure.lang.RT.load(RT.java:440)
	at clojure.lang.RT.load(RT.java:411)
	at clojure.core$load$fn__5066.invoke(core.clj:5641)
	at clojure.core$load.doInvoke(core.clj:5640)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.core$load_one.invoke(core.clj:5446)
	at clojure.core$load_lib$fn__5015.invoke(core.clj:5486)
	at clojure.core$load_lib.doInvoke(core.clj:5485)
	at clojure.lang.RestFn.applyTo(RestFn.java:142)
	at clojure.core$apply.invoke(core.clj:626)
	at clojure.core$load_libs.doInvoke(core.clj:5524)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.core$apply.invoke(core.clj:626)
	at clojure.core$require.doInvoke(core.clj:5607)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at user$eval1884.invoke(form-init6964782882533247650.clj:1)
	at clojure.lang.Compiler.eval(Compiler.java:6703)
	at clojure.lang.Compiler.eval(Compiler.java:6666)
	at clojure.core$eval.invoke(core.clj:2927)
	at clojure.main$eval_opt.invoke(main.clj:288)
	at clojure.main$initialize.invoke(main.clj:307)
	at clojure.main$null_opt.invoke(main.clj:342)
	at clojure.main$main.doInvoke(main.clj:420)
	at clojure.lang.RestFn.invoke(RestFn.java:421)
	at clojure.lang.Var.invoke(Var.java:383)
	at clojure.lang.AFn.applyToHelper(AFn.java:156)
	at clojure.lang.Var.applyTo(Var.java:700)
	at clojure.main.main(main.java:37)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at clojure.lang.Reflector.invokeMatchingMethod(Reflector.java:93)
	at clojure.lang.Reflector.invokeStaticMethod(Reflector.java:207)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at clojure.lang.Reflector.invokeMatchingMethod(Reflector.java:93)
	at clojure.lang.Reflector.invokeStaticMethod(Reflector.java:207)
	at user$eval1870.invoke(form-init6964782882533247650.clj:1)
	at clojure.lang.Compiler.eval(Compiler.java:6703)
	at clojure.lang.Compiler.eval(Compiler.java:6693)
	at clojure.lang.Compiler.load(Compiler.java:7130)
	at clojure.lang.Compiler.loadFile(Compiler.java:7086)
	at clojure.main$load_script.invoke(main.clj:274)
	at clojure.main$init_opt.invoke(main.clj:279)
	at clojure.main$initialize.invoke(main.clj:307)
	at clojure.main$null_opt.invoke(main.clj:342)
	at clojure.main$main.doInvoke(main.clj:420)
	at clojure.lang.RestFn.invoke(RestFn.java:421)
	at clojure.lang.Var.invoke(Var.java:383)
	at clojure.lang.AFn.applyToHelper(AFn.java:156)
	at clojure.lang.Var.applyTo(Var.java:700)
	at clojure.main.main(main.java:37)
Caused by: java.lang.ClassCastException: clojure.lang.Symbol cannot be cast to java.util.Map$Entry
	at clojure.lang.APersistentMap$KeySeq.first(APersistentMap.java:154)
	at clojure.lang.RT.first(RT.java:577)
	at clojure.core$first.invoke(core.clj:55)
	at clojure.core$zipmap.invoke(core.clj:2790)
	at clojure.core.async.impl.ioc_macros$parse_to_state_machine$fn__3229.invoke(ioc_macros.clj:806)
	at clojure.core.async.impl.ioc_macros$get_plan.invoke(ioc_macros.clj:77)
	at clojure.core.async.impl.ioc_macros$parse_to_state_machine.invoke(ioc_macros.clj:805)
	at clojure.core.async.impl.ioc_macros$state_machine.invoke(ioc_macros.clj:990)
	at clojure.core.typed.async$go.doInvoke(async.clj:328)
	at clojure.lang.RestFn.invoke(RestFn.java:442)
	at clojure.lang.Var.invoke(Var.java:388)
	at clojure.lang.AFn.applyToHelper(AFn.java:160)
	at clojure.lang.Var.applyTo(Var.java:700)
	at clojure.lang.Compiler.macroexpand1(Compiler.java:6552)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6630)
	... 82 more
```

## License

Copyright © 2014 Gary Fredericks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
