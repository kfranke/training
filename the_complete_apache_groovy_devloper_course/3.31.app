def timestamp = new Date()
Device d1 = new Device(esn:'0-1234', id:1, created_on:timestamp)
Device d2 = new Device(esn:'0-3345', id:2, created_on:timestamp)
Device d3 = new Device(esn:'0-5555', id:3, created_on:timestamp)

final List<Device> devices = [d1, d2, d3]

final List<Device> sorted = devices.toSorted()

assert sorted.first().id == 2 //false

