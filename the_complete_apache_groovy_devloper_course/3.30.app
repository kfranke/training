
def d = new Date()
def c1 = new Customer(first:"Tom", last:"Jones",age:21,since:d,favItems:["books","games"])
def c2 = new Customer('Tom','Jones',21,d,['books','games'])
assert c1 == c2

c1.first = "dan"