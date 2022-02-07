import subprocess
import os
import time

port = input('开启隧道: ')

while(True):
  command = "cpolar http " + port
  print('隧道开启完成')
  run = subprocess.Popen(command)
  time.sleep(1800)
  run.kill()
  os.system('cls')
  print('隧道重启中')
