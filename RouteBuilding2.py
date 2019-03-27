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
routes_t = []


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
    i = 1
    for row_index in range(hr, numrows() + hr):
        route_num = cs.cell(row_index, 4).value
        while (route_num > 1):
            for col_index in range(1,6): 
                stop = []
                cell_val = cs.cell(row_index, col_index).value
                if cs.cell_type(row_index, col_index) == xlrd.XL_CELL_DATE:
                    my_time = float(cell_val*24)
                    stop.append(my_time)
                else:
                    stop.append(cell_val)
                print(stop[3])
            route_num.append([])
            i += 1
        routes_t[i - 1].append(cs.cell(row_index, 5).value)
    return(routes_t)

           
print(stops())