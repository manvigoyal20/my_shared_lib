def call(Map config){
    parameterDefinitions([

    choice(name:'branch', choices:['main', 'develop'], description:'choose any branch')
    booleanParam(name: 'testParam', defaultValue: 'true', description:'select true or false')

    ])
}