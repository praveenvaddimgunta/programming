import sys

def main():
	print 'hello p'
	a=6;
	b=5;
	print a+b;
	asd()

def asd():
	print 'asd'

def fcuk():
	if(1==1):
		main()
		print 'sas'
	else:
		asd()
		print 'nos'


if __name__ == '__main__':
	main()
	asd()
	main()
	fcuk()
