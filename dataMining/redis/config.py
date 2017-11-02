import redis

r = redis.StrictRedis(host = '172.16.88.134', port=6379, db=0)

# r.set('test','testContext')
# text = r.get('test')
# print text