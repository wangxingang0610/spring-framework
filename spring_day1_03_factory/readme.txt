
问题：
    原对象都需要new，耦合性高
解决问题：
    使用工厂，将每次创建的对象放入factory
    1、产生对象的配置，放入bean.properties
    2、Factory类