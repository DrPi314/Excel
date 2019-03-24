# -*- coding: utf-8 -*-
"""
Created on Sun Mar 24 09:05:10 2019

@author: Alex Pagels
"""

import xlrd


wb = xlrd.open_workbook("E:/OneDrive/Documents/Work/BDS/Orders/201901/0128-0202/Minneapolis 02-01 FRI.xlsm")
cs = wb.sheet_by_name('ORDERFORM')
hr = 9
num_columns = 6
stops_t = []
routes_t = []


def numrows():
    num_rows = 0
    for row_index in range(9, 50):
        cell_val = cs.cell(row_index, 6)
        if cell_val != '':
            num_rows += 1
            continue
        else:
            print(num_rows)
            
#print(numrows())