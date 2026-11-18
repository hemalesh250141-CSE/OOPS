class Electricity:
    def __init__(self, units):
        self.units = units

    def calculate(self):
        if self.units <= 100:
            bill = self.units * 2
        elif self.units <= 200:
            bill = 200 + (self.units - 100) * 3
        else:
            bill = 500 + (self.units - 200) * 5

        print("Bill Amount:", bill)

e = Electricity(250)
e.calculate()
