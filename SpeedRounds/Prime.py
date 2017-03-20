
x = 600851475143
#x = 13195

d = 2


while x > 1:
	if (x%d == 0):
		print ""
		print x
		print d
		print x/d
		x /= d
	else:
		d += 1
