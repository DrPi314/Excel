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
cols = [4, 2, 3, 1]


def numrows():
    num_rows = 0
    for row_index in range(hr, cs.nrows):
        cell_val = cs.cell(row_index, 1).value
        if cell_val != '':
            num_rows += 1
        else:
            break
    return(num_rows)
    

def stops():
    for row_index in range(hr, numrows()):
        for col_index in cols:
            cell_val = cs.cell(row_index, col_index).value
            if cs.cell_type(row_index, col_index) == xlrd.XL_CELL_DATE:
                my_time = int(cell_val*24)
                stops_t.append(my_time)
            else:
                stops_t.append(cell_val)
                
print(stops())