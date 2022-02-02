import requests
import re
import time
import pymysql.cursors

if __name__ == '__main__':
    tunnel = 'null'
    connect = pymysql.Connect(
        host='',
        port=3306,
        user='root',
        passwd='',
        db='tunnelurl',
        charset='utf8'
    )

    while(True):
        try:
            response = requests.get('http://localhost:4040')
            html = response.text
            url = re.findall('[a-zA-z]+://[^\s]*', html)
        except Exception:
            print('隧道异常 请检查隧道状态')
            continue
        if tunnel == url[0][0:25]:
            print('url未改变 url为：' + tunnel) 
            print('系统休眠中')
            time.sleep(30)
            continue
        tunnel = url[0][0:25]
        cursor = connect.cursor()
        sql = "UPDATE url set tunnel = '%s' where id = 1"
        cursor.execute(sql % tunnel)
        connect.commit()
        if(cursor.rowcount == 1):
            print("数据库数据更新成功")
        cursor.close()
        print('当前隧道url为：' + tunnel)
        print('系统休眠中')
        time.sleep(30)
