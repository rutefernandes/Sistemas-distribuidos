require 'socket'
s = UDPSocket.new
msg = gets.chomp
s.send(msg, 0, 'localhost', 1234) #msg, flag, host, port