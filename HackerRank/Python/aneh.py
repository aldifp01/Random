#!/bin/python

import math
import os
import random
import re
import sys

#input dari 1-100
x = input()
if(x%2==1):
    print("Weird")
elif((x%2!=1)and(x>=2)and(x<6)):
    print("Not Weird")
elif((x%2!=1)and(x>=6)and(x<21)):
    print("Weird")
elif(x>20):
    print("Not Weird")
