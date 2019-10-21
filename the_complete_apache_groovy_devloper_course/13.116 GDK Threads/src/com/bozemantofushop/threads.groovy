package com.bozemantofushop

//closures implement runnable

def t = new Thread() { /*do stuff*/ }
t.start()

Thread.start{ /* do stuff */ }
Thread.start('thread-name'){ /*do stuff*/ }

Thread.startDaemon('thread-name') { /*do stuff*/ }
