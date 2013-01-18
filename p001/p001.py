#!/usr/bin/python2

cap = 1000
count = 0
for i in xrange(1,cap):
	if i % 3 == 0 or i % 5 == 0:
		count += i

print count

