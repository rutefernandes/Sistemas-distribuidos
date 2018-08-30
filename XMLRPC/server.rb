require "xmlrpc/server"
server = XMLRPC::Server.new(8081)
server.add_handler("ab.sum_and_difference") do |a,b|
	{"sum" => a+b, "difference" => a-b}
end
server.add_handler("ba.sum_and_difference") do |a,b|
	{"sum" => a+b, "difference" => b-a}
end
server.serve #Call this after you have added all you handlers to the server. This method starts the server to listen for XML-RPC requests and answer them.