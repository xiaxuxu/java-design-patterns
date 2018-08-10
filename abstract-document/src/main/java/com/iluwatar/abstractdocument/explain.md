#抽象文档模式
>为了更灵活地给不同的对象添加不同的组件。

一个Car,他有wheel,door，

car,wheel,door又都有 model，price


car实现parts接口(即他可以获得组件)。
这样实现了car也可以增加其他的组件。