<template>
	<view class="content">
		<view class="logo" v-if="false">
			<image :style='{"boxShadow":"0 0 16rpx #59f43e","borderColor":"#ccc","borderRadius":"40rpx","borderWidth":"2rpx","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20210324/ae8c706f801b4dc38e14973c66707e59.jpg","isShow":false,"height":"160rpx"}' src='http://codegen.caihongy.cn/20210324/ae8c706f801b4dc38e14973c66707e59.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.yonghuming" type="text" class="uni-input" name="" placeholder="用户名" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.yonghuxingming" type="text" class="uni-input" name="" placeholder="用户姓名" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
                        <picker @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
                                <view :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.shoujihaoma" type="text" class="uni-input" name="" placeholder="手机号码" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.dizhi" type="text" class="uni-input" name="" placeholder="地址" />
		</view>
		<view v-if="tableName=='maijia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.maijiazhanghao" type="text" class="uni-input" name="" placeholder="卖家账号" />
		</view>
		<view v-if="tableName=='maijia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='maijia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.maijiaxingming" type="text" class="uni-input" name="" placeholder="卖家姓名" />
		</view>
		<view v-if="tableName=='maijia'" class="uni-form-item uni-column">
                        <picker @change="maijiaxingbieChange" :value="maijiaxingbieIndex" :range="maijiaxingbieOptions">
                                <view :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='maijia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='maijia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.lianxidianhua" type="text" class="uni-input" name="" placeholder="联系电话" />
		</view>
		<view v-if="tableName=='maijia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"12rpx","color":"#333","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"#ccc","backgroundColor":"rgba(244, 67, 54, 1)","borderRadius":"12rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0px","fontSize":"30rpx","borderStyle":"solid","height":"76rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                yonghuxingbieOptions: [],
                                yonghuxingbieIndex: 0,
                                maijiaxingbieOptions: [],
                                maijiaxingbieIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                        	this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='maijia'){
                        	this.maijiaxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.maijiaxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        yonghuxingbieChange(e) {
                                this.yonghuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
                        },
                        // 下拉变化
                        maijiaxingbieChange(e) {
                                this.maijiaxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.maijiaxingbieOptions[this.maijiaxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.yonghuming) && `yonghu` == this.tableName){
					this.$utils.msg(`用户名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.yonghuxingming) && `yonghu` == this.tableName){
					this.$utils.msg(`用户姓名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if((!this.ruleForm.maijiazhanghao) && `maijia` == this.tableName){
					this.$utils.msg(`卖家账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `maijia` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.maijiaxingming) && `maijia` == this.tableName){
					this.$utils.msg(`卖家姓名不能为空`);
					return
				}
				if(`maijia` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				if(`maijia` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 60rpx;
}

</style>
