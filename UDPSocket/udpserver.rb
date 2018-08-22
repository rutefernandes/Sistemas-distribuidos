require 'socket'
s = UDPSocket.new
s.bind(nil, 1234) #binds udpsocket to a host:port
5.times 
do
  text, sender = s.recvfrom(16) #sender invokes a method that receives a certain amount of bytes
  puts text
end